# USER MANAGEMENT APP - April 2025 
A full-stack web application that allows users to be added, updated, deleted, and viewed using a modern tech stack—built with Spring Boot (Maven), React.js, and MongoDB.

##  Prerequisites :

  > ✅ Java 17+

  > ✅ Node.js 18+

  > ✅ MongoDB installed locally or connected via Atlas

  > ✅ Git & Maven

## Frontend - React.js :

1) Developed a clean and responsive UI using React functional components and Hooks (useState, useEffect).
2) Integrated with backend using Axios to perform asynchronous API calls.
3) Implemented form validation and controlled components for user input.
4) Displayed real-time updates by re-fetching users after each operation.
5) Styled components using custom CSS and structured layout with Flexbox/Grid.

## Backend – Spring Boot (Maven) :

1) Created RESTful APIs with Spring Web.
2) Used Spring Data MongoDB for repository and database operations.
3) Implemented endpoints:

   > GET /api/users – fetch all users

   > POST /api/users – add new user

   > PUT /api/users/{id} – update user info

   > DELETE /api/users/{id} – delete a user

4) Handled cross-origin requests with CORS configuration to support frontend integration.

## Database – MongoDB :

1) Stored user data including fields like id, name, and email.
2) Connected MongoDB using spring.data.mongodb.uri in application.properties.
3) Allowed Spring Boot to auto-generate ObjectIds for new entries.
4) Ensured schema flexibility for future scalability.

## Security & Configuration :

1) Configured CORS globally to allow requests from localhost:3000.
2) Removed manual MongoClient setup in favor of Spring Boot auto-configuration.
3) Managed API errors with proper status codes and ResponseEntity.

## Version Control & Deployment :

1) Managed source code using Git and pushed to a private/public GitHub repository.
2) Utilized Git best practices: .gitignore, README.md, and meaningful commit messages.
3) Tested endpoints via Postman and browser.

## 🚀 Key Features :

1) Add, update, delete, and view users in real-time
2) Lightweight, responsive UI with form state handling
3) Clean REST architecture and scalable MongoDB design

## Screenshots :

#### User Management Dashboard
![{E0CED82D-11D3-42E4-A892-B62B9C66916A}](https://github.com/user-attachments/assets/c5f0067e-f86f-4068-8c2f-d2060f49023e)

#### ADD USER :
![{1BF36714-873F-4918-A7F0-2590F452BF18}](https://github.com/user-attachments/assets/aaf36c93-cd31-40cb-84b8-ec6081504a87)

#### UPDATE USER :
![{B6B0BA32-3424-404A-A602-B509F77D9966}](https://github.com/user-attachments/assets/98691382-0c17-4f60-bc17-80e652ae0ebe)

#### DELETE USER :
![{C277CE32-0DC6-446A-A183-DC0F1EC6C9C1}](https://github.com/user-attachments/assets/ea097630-0e28-47ce-8521-f648f4b06da2)

#### MongoDB Database :
![{FB94D59E-C350-4F80-8D94-A41455CB1EA3}](https://github.com/user-attachments/assets/009af414-3345-4cf9-8217-a8592023c73f)

End!!

It was fun doing this project with the help of dinesh sir! hoping to improve its front end and its interface more and more soon. 





