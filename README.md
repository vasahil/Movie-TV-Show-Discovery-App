<b>Experience While Building the App</b>

     Building this app was a great hands-on experience in:

      1. Working with real-world APIs

      2. Using RxJava Single.zip() for parallel API calls

      3. Implementing MVVM architecture properly

      4. Managing UI states using a sealed class (ResultState)

      5. Applying Clean Architecture principles by separating:

      6. DTOs (API layer)

      7. Domain models (UI/business layer)

      8. UI models (Compose layer)

      9. It helped me understand how professional Android apps manage data flow, error handling, and UI rendering.

✨ Features Implemented

🔄 Parallel API Calls using Single.zip

Movies and TV Shows are fetched simultaneously.

🏠 Home Screen

Tab layout to switch between:

Movies

TV Shows

Shimmer effect while loading data

Pull-to-refresh functionality

Cached results for 5 minutes to reduce unnecessary API calls

📄 Details Screen

Shows:

Title

Description

Release date

Genres

Poster & backdrop image

Language, type, and network

Shimmer effect while loading

🧩 MVVM Architecture

View → observes StateFlow

ViewModel → manages UI state

Repository → handles API calls

API layer → Retrofit + RxJava

⚠️ Graceful Error Handling

Snackbar for errors

Retry option

Friendly error messages:

No internet

Timeout

Invalid API key (401)

🧪 Dependency Injection

Implemented using Koin

🖼️ Image Loading

Coil with memory & disk caching

✨ Features Implemented

🔄 Parallel API Calls using Single.zip

Movies and TV Shows are fetched simultaneously.

🏠 Home Screen

Tab layout to switch between:

Movies

TV Shows

Shimmer effect while loading data

Pull-to-refresh functionality

Cached results for 5 minutes to reduce unnecessary API calls

📄 Details Screen

Shows:

Title

Description

Release date

Genres

Poster & backdrop image

Language, type, and network

Shimmer effect while loading

🧩 MVVM Architecture

View → observes StateFlow

ViewModel → manages UI state

Repository → handles API calls

API layer → Retrofit + RxJava

⚠️ Graceful Error Handling

Snackbar for errors

Retry option

Friendly error messages:

No internet

Timeout

Invalid API key (401)

🧪 Dependency Injection

Implemented using Koin

🖼️ Image Loading

Coil with memory & disk caching



Challenges Faced

Handling API Authentication (401 Errors)

Debugging Gradle BuildConfig issues and learning how to safely inject API keys from local.properties.

Single.zip Usage

Understanding how to combine two API calls and emit a single result.

State Management

Making sure UI updates correctly for:

Loading

Success

Error

DTO → Domain Mapping

Avoiding bad practice of using API DTOs directly in UI.

Implementing proper mapping layers.

Compose Performance

Handling recompositions and shimmer animations smoothly.


Assumptions Made

The app shows limited results (20 items) for performance and simplicity.

Region was set to "IN" assuming usage in India.

UI design is kept simple as logic and architecture were the main focus.

Only basic details are shown in Home screen, detailed information is deferred to Details screen.

Caching duration is fixed at 5 minutes.
