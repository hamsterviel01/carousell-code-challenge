# carousell-code-challenge
This document will draft out implementation plan for carousell-coding-challenge project
# Requirement
Title: Digg / Reddit clone with upvote and downvotes

Digg and Reddit are sites powered by their users’ upvotes and downvotes. When a user makes a contribution to their website, other users may upvote or downvote a particular topic, giving rise to a set of topics that are popular and unpopular. Your challenge is to develop a website will allow users to contribute topics and upvote or downvote these topics.

Functionality that must be present:
  - Maintain a list of topics and its upvotes/downvotes
  - Allow the user to submit topics. For this challenge, a “topic” is simply a string that does not exceed 255 characters.
  - Allow the user to upvote or downvote a topic. For this challenge, the user may upvote or downvote the same topic multiple times.
  - Always return a list of top 20 topics (sorted by upvotes, descending) on the homepage
  - In-memory: Design an in-memory data structure (shared by the same process as your application) that will allow you to keep the topics in memory without using data persistence. It is okay for the topics to disappear after the application restarts. You may use data structures provided by your language’s standard library to build your data structure. Please note that in-memory data structure stores such as Redis and relational databases are not allowed.
Code comments and documentation: For the key functionalities mentioned above, you should provide code comments and text-based documentation (eg. README) on the hows and whys of your implementation and the assumptions you are making.

For the purpose of this challenge, you should not work on the following:
  - User authentication / logins
  - Check for duplicate upvotes, i.e. your application should allow the same user / person to upvote on a topic multiple times
  - Data Persistence
  - Nice design for the webpage. A simple, easy to operate website will suffice.

# Architecture Design

React - Redux will be used as a framework for this application.

# Checklist of function

# Deployment