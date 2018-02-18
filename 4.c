#include<stdio.h>
#include<sys/types.h>

#define MAX_COUNT 3

void ChildProcess(void);
void ParentProcess(void);

void main()
{
	pid_t pid;

	pid = fork();
	if(pid == 0)
		ChildProcess();
	else
		ParentProcess();
}

void ChildProcess(void)
{
	int i, pid = getpid();

	for(i=1 ; i<=MAX_COUNT ; i++)
	{
		printf("CHILD\tPID[%d]   \tVALUE[%d]\n" , pid , i);
		sleep(1);
	}
	printf("-----Child Process done!-----\n");

}

void ParentProcess(void)
{
	int i, pid = getpid();

	for(i=1 ; i<=MAX_COUNT ; i++)
	{
		printf("PARENT\tPID[%d]   \tVALUE[%d]\n" , pid , i);
		sleep(2);
	}
	printf("-----Parent process done!-----\n");
}

