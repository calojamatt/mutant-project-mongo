# Mutants Project

Project to validate if a dna is mutant or not.

## Execution instructions
1. clone the repo to local environment
2. run : mvn install package
3. run : mvn spring-boot:run

## Available Endpoints

##  mutants dna endpoint
### method: post
hostname:port/api/v1/mutant-dna/mutant/

curl --location --request POST 'localhost:9001/api/v1/mutant-dna/mutant/' \
--data-raw '{"dna":["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]}'

##  stats endpoint
### method: get
hostname:port/api/v1/mutant-dna/mutant/

#### curl request
curl --location --request GET 'localhost:9001/api/v1/mutant-dna/stats'