FROM clojure:openjdk-8-lein-2.9.1 
WORKDIR /bionitio
COPY . .

#RUN lein bin
RUN lein uberjar
ENV PATH "/bionitio/:${PATH}"
