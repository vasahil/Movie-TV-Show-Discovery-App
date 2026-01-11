APK is in the release section in the right side 

OR

You can use below Drive Link :
https://drive.google.com/drive/folders/1bzxeeH7P6z9KfR_RymMIcnQ1O3zQ_uR8


# 🎬 Movie & TV Show Discovery App

An Android application built using **Jetpack Compose** that fetches Movies and TV Shows from the **Watchmode API**.  
The project focuses on clean MVVM architecture, efficient API handling, and modern UI practices.

---

## 🚀 Experience While Building

This project helped me gain hands-on experience with:

- Parallel API calls using **RxJava Single.zip()**
- Clean separation between DTO, Domain, and UI layers
- State management using a sealed class (`ResultState`)
- Jetpack Compose UI development
- Dependency Injection using **Koin**

---

## ✨ Features Implemented

- Fetch Movies & TV Shows from Watchmode API  
- Tab switch between **Movies** and **TV Shows**
- Shimmer effect while loading data
- Details screen showing:
  - Title
  - Description
  - Release date
  - Poster / Backdrop
- Parallel API calls using `Single.zip()`
- Error handling using **Snackbar + Retry**
- Pull-to-refresh functionality
- 5-minute caching for better performance
- Image loading using **Coil**

---

## 🛠 Tech Stack

- Kotlin  
- Jetpack Compose  
- Retrofit  
- RxJava3  
- Koin  
- Coil  
- MVVM Architecture  

---

## ⚠ Challenges Faced

- Handling **HTTP 401 errors** caused by Gradle API key injection issues
- Understanding and implementing `Single.zip()` for parallel API calls
- Proper mapping from DTOs to Domain Models
- Managing recomposition in Compose efficiently

---

## 🤔 Assumptions Made

- Only 20 items are fetched per API call for simplicity
- Region is set to **India (IN)**
- UI design is simple; focus is on logic and architecture
- Cache duration is fixed at **5 minutes**

---
