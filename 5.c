#include<stdio.h>
#include<stdlib.h>
#include<pthread.h>

void *myThreadFunc(void *vargp)
{
	int thread_id = pthread_self();
	sleep(1);
	printf("THREAD[%d]\n" , thread_id);
	return NULL;
}

void main()
{
	int i;
	pthread_t tid[2];
	printf("Before Thread\n");
	for(i=0 ; i<2 ; i++)
	{
		pthread_create(&tid[i] , NULL , myThreadFunc , NULL);
	}
	pthread_join(tid[0] , NULL);
	pthread_join(tid[1] , NULL);
	printf("After Thread\n");
	exit(0);
}
