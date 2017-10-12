FROM java:8

ADD gameserver.tar /usr/src/myapp
COPY ./config /usr/src/myapp/gameserver/config

WORKDIR /usr/src/myapp/gameserver

CMD ["./bin/gameserver"]

EXPOSE 8080 5555 6666 