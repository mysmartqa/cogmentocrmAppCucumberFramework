$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/MavenProject/cogmentocrmAppCucumberFramework/src/main/java/cogmentocrmApp/QA/CucumberFeatures/LoginFeature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate User will able to successfully login to the App",
  "description": "",
  "id": "free-crm-application-test;validate-user-will-able-to-successfully-login-to-the-app",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user opens the CRM App with a required browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user successfully Login to the CRM app",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Verify the username title",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user will successfully logout",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Close the app",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_opens_the_CRM_App_with_a_required_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.user_successfully_Login_to_the_CRM_app()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.verify_the_username_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ContactsSteps.user_will_successfully_logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.close_the_app()"
});
formatter.result({
  "status": "skipped"
});
});