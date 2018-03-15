#include<stdlib.h>
#include<stdio.h>
#include<unistd.h>

#define MSGSIZE 16

char* msg = "hello world!";

void main()
{
	char inbuf[MSGSIZE];
	int p[2] , pid , nbytes;

	if(pipe(p) < 0)
		exit(1);

	if((pid = fork()) > 0)
	{
		close(p[0]);
		write(p[1] , msg , MSGSIZE);
		close(p[1]);
		wait(NULL);
	}
	else
	{
		close(p[1]);
		while((nbytes = read(p[0] , inbuf , MSGSIZE)) > 0)
			printf("%s\n" , inbuf);
		close(p[0]);
		if(nbytes != 0)
			exit(2);
		printf("Finished reading!\n");
	}
}
