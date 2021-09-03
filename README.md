# SpringBoot with GitHub Actions and Heroku

Simple repo showing how to use GitHub Actions to dockerize a SpringBoot service and deploy to Heroku.

At every code push onto the `main` branch the service is built with Maven-JDK11 and pushed to the Heroku Registry where
the image is built and deployed.

The Heroku API Key is required (configured as GitHub Actions secret).

See also [Deploy to Heroku From a MacBook M1: Heroku CLI or GitHubActions](https://medium.com/geekculture/deploy-to-heroku-from-a-macbook-m1-heroku-cli-or-githubactions-868bc3a50935) on Medium 


## Setup

Create your own GitHub repository (ie mySpringBootService)

Clone and mirror this repository
```
git clone --bare https://github.com/gcatanese/SpringBootService.git
cd SpringBootService
git push --mirror https://github.com/{my_username}/mySpringBootService.git

cd ..
cd mySpringBootService
```
You now can work with your own repository (ie mySpringBootService)

Create a new Heroku application via the Heroku Dashboard or using the Heroku CLI
```
heroku create myapp
```

Create 2 Actions Secrets: go to `Settings->Secrets->New repository secret`
* HEROKU_API_KEY: {copy this from Heroku Account "API Key"}
* HEROKU_APP_NAME: myapp

Push the repository to start the Github Action workflow (or kick it off manually)

![Output of the GitHub Actions workflow](workflow.png?raw=true "GitHub Actions workflow")
