FROM tomcat

RUN mkdir /usr/local/tomcat/webapps/app/ \
 /usr/local/tomcat/webapps/app/WEB-INF/ \
 /usr/local/tomcat/webapps/app/WEB-INF/lib/

WORKDIR /usr/local/tomcat/webapps/app

COPY /src/main/webapp/WEB-INF/pages/index.jsp index.jsp


CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]
