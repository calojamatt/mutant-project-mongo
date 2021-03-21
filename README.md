# Mutants Project

Project to validate if a dna is mutant or not.

## Execution instructions local environment
1. clone the repo to a local directory
2. run : mvn install package
3. run : mvn spring-boot:run

## Available Endpoints

##  Mutants DNA endpoint
### method: post
http://hostname:port/api/v1/mutant-dna/mutant/

#### Local Environment
curl --location --request POST 'localhost:5000/api/v1/mutant-dna/mutant/' \
--data-raw '{"dna":["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]}'

#### AWS Environment
curl --location --request POST 'http://mutant-dna-project-dev.us-east-2.elasticbeanstalk.com/api/v1/mutant-dna/mutant/' \
--data-raw '{"dna":["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]}'


##  Stats endpoint
### method: get
http://hostname:port/api/v1/mutant-dna/stats

#### Local Environment
curl --location --request GET 'localhost:5000/api/v1/mutant-dna/stats'

#### AWS Environment
curl --location --request GET 'http://mutant-dna-project-dev.us-east-2.elasticbeanstalk.com/api/v1/mutant-dna/stats'
