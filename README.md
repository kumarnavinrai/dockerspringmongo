# dockerspringmongo

##Step 1
first install decker desktop on your system
then cmd will start working from your terminal

##Step 2
To check the list of images
# docker images

##Step 3
To create image for your springboot project go inside the spring boot project root directory
then give this command
# docker build -t springdockercompose .
This command will create the docker image according to the dockerfile at the root of the project
Then check the docker image as docker images command

##Step 4
Now we are using mongodb as db now need to pull mongodb image for that run the command
# docker pull mongo

##Step5
Now we need to write dockercompose file and that file should be in resources folder of
# docker compose up
