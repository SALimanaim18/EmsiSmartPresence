# EMSI SmartPresence - Mobile Attendance Tracking Application

## Project Overview
In the current context of digital transformation in education, administrative management in higher education institutions faces numerous challenges, especially regarding student attendance tracking. At EMSI, as in many schools, this essential task often remains manual, time-consuming, and error-prone, resulting in frequent mistakes, lack of centralized data, and no real-time pedagogical analysis tools.  

To address this problem, we developed **EMSI SmartPresence**, an intuitive **Android mobile application** that allows teachers to consult their groups and mark student attendance through an ergonomic interface that adheres to modern mobile design standards.  

The application leverages **Firebase Firestore**, providing a real-time NoSQL cloud database perfectly suited for dynamic synchronization between teachers and educational data. With a clear hierarchical structure (cities > schools > levels > groups > students), the app offers smooth navigation, logical organization of educational entities, and potential for future advanced features such as geolocation of institutions or predictive analytics using AI.  

This project contributes to the pedagogical and administrative modernization by providing teachers with a reliable, connected tool ready to be integrated into EMSI's academic environment.

---

## Architecture & Technologies

| Layer                  | Technology / Tool                  |
|------------------------|-----------------------------------|
| Mobile App             | Java, Android SDK                 |
| Backend / Database     | Firebase Firestore (NoSQL, real-time) |
| Authentication         | Firebase Authentication           |
| Deployment             | APK installation on Android devices |
| Future Enhancements    | AI analytics, geolocation, notifications |

---

## Installation & Setup

### Prerequisites
- Android Studio  
- Java 17+  
- Android device or emulator  

---

### 1. Clone the repository
```bash
git clone https://github.com/username/EMSI-SmartPresence.git
cd EMSI-SmartPresence
```
### 2. Open Project in Android Studio
1. Open the project folder in **Android Studio**  
2. Allow Gradle to sync dependencies  

### 3. Configure Firebase
1. Create a Firebase project at [https://console.firebase.google.com](https://console.firebase.google.com)  
2. Download `google-services.json` and place it in the `app/` directory  
3. Enable **Firestore Database** and **Authentication** (Email/Password)  

### 4. Run on Emulator or Device
1. Connect an Android device or start an emulator  
2. Click **Run** in Android Studio  
3. The app will launch, and you can test attendance marking and real-time synchronization  

---

## Key Features

### Teacher Interface
- View and manage groups of students  
- Mark student attendance digitally  
- Access real-time attendance history  
- Smooth navigation through a hierarchical structure: cities > schools > levels > groups > students  

### Administrator Interface (optional)
- Monitor attendance across groups and levels  
- Generate reports and analytics  
- Secure login and role-based access  

### Security
- Firebase Authentication for teachers and admins  
- Cloud-based real-time database ensures data consistency  
- Role-based access for sensitive educational information
