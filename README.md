# MyTestWork

## Before you run

1. You must bind your mysql from localhost to ip
2. in my.ini bind ip-address => <your current ip> example <bind-address="192.168.43.229">
3. in apilication properties MyTestWork and MyTestWork2 change spring.datasource.url=jdbc:mysql://<your current ip address>/vuesucode => example spring.datasource.url=jdbc:mysql://192.168.43.229/vuesucode


## After that
1. open terminal 
2. docker-compose up
3. open localhost:9051/<api first project>
4. open localhost:9052/<api second project>