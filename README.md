<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Movie & TV Show Discovery App</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #0f172a;
            color: #e5e7eb;
            line-height: 1.6;
            padding: 20px;
        }
        h1, h2, h3 {
            color: #38bdf8;
        }
        .container {
            max-width: 900px;
            margin: auto;
            background: #020617;
            padding: 25px;
            border-radius: 10px;
        }
        .section {
            margin-bottom: 25px;
        }
        ul {
            padding-left: 20px;
        }
        li {
            margin-bottom: 6px;
        }
        .badge {
            display: inline-block;
            background: #1e293b;
            padding: 5px 12px;
            border-radius: 20px;
            margin: 4px;
            font-size: 14px;
            color: #38bdf8;
        }
        .table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 10px;
        }
        .table th, .table td {
            border: 1px solid #1e293b;
            padding: 10px;
            text-align: left;
        }
        .table th {
            background: #020617;
            color: #38bdf8;
        }
        .footer {
            text-align: center;
            margin-top: 30px;
            color: #94a3b8;
        }
    </style>
</head>
<body>

<div class="container">

    <h1>🎬 Movie & TV Show Discovery App</h1>
    <p>
        An Android application built using <b>Jetpack Compose</b> that fetches Movies and TV Shows 
        from the <b>Watchmode API</b>.  
        The project focuses on strong architecture, efficient API handling, and clean MVVM design.
    </p>

    <div class="section">
        <h2>🚀 Experience While Building</h2>
        <p>
            This project helped me understand real-world Android development using:
        </p>
        <ul>
            <li>Parallel API calls using <b>RxJava Single.zip()</b></li>
            <li>Clean separation of DTO, Domain, and UI layers</li>
            <li>State management with <b>ResultState</b></li>
            <li>Modern UI using Jetpack Compose</li>
            <li>Dependency Injection using Koin</li>
        </ul>
    </div>

    <div class="section">
        <h2>✨ Features Implemented</h2>
        <ul>
            <li>Movies & TV Shows listing using Watchmode API</li>
            <li>Tab switch between Movies and TV Shows</li>
            <li>Shimmer effect during loading</li>
            <li>Details screen with full information</li>
            <li>Parallel API calls using Single.zip</li>
            <li>Error handling with Snackbar + Retry</li>
            <li>Pull to Refresh</li>
            <li>5 minutes in-memory caching</li>
            <li>Image loading using Coil</li>
        </ul>
    </div>

    <div class="section">
        <h2>🛠 Tech Stack</h2>
        <div>
            <span class="badge">Kotlin</span>
            <span class="badge">Jetpack Compose</span>
            <span class="badge">Retrofit</span>
            <span class="badge">RxJava3</span>
            <span class="badge">Koin</span>
            <span class="badge">Coil</span>
            <span class="badge">MVVM</span>
        </div>
    </div>

    <div class="section">
        <h2>⚠ Challenges Faced</h2>
        <ul>
            <li>Handling HTTP 401 errors and Gradle API key injection</li>
            <li>Understanding Single.zip for simultaneous API calls</li>
            <li>Proper mapping from DTOs to Domain models</li>
            <li>Managing Compose recompositions efficiently</li>
        </ul>
    </div>

    <div class="section">
        <h2>🤔 Assumptions Made</h2>
        <ul>
            <li>Limited results (20 items) for performance</li>
            <li>Region set to India ("IN")</li>
            <li>Simple UI with more focus on logic and architecture</li>
            <li>Cache duration fixed at 5 minutes</li>
        </ul>
    </div>

   

</div>

</body>
</html>
