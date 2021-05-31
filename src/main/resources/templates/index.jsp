<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Primary Meta Tags -->
    <title></title>
    <!--    <meta name="title" content=${title}>-->
    <!--    <meta name="description" content="<%= process.env.DESCRIPTION %>">-->
    <!--    <meta name="theme-color" content="<%= process.env.COLOR %>">-->
    <!--    <meta name="msapplication-TileColor" content="<%= process.env.COLOR %>">-->

    <!--    &lt;!&ndash; Open Graph / Facebook &ndash;&gt;-->
    <!--    <meta property="og:type" content="website">-->
    <!--    <meta property="og:url" content="<%= process.env.DOMAIN %>">-->
    <!--    <meta property="og:title" content="<%= process.env.TITLE %>">-->
    <!--    <meta property="og:description" content="<%= process.env.DESCRIPTION %>">-->

    <!--    &lt;!&ndash; Twitter &ndash;&gt;-->
    <!--    <meta property="twitter:card" content="summary_large_image">-->
    <!--    <meta property="twitter:url" content="<%= process.env.DOMAIN %>">-->
    <!--    <meta property="twitter:title" content="<%= process.env.TITLE %>">-->
    <!--    <meta property="twitter:description" content="<%= process.env.DESCRIPTION %>">-->

    <style>
        body {
            background-color: #121212;
            text-align: center;
            font-family: 'Poppins', sans-serif;
        }

        h1 {
            color: white;
            font-size: 50px;
            font-weight: 700;
            opacity: 0.87;
        }

        h2 {
            color: white;
            font-style: italic;
            font-size: 30px;
            opacity: 0.60;
        }

        .container {
            height: 200px;
            width: 100%;
            position: absolute;
            top: 0;
            bottom: 0;
            left: 0;
            right: 0;
            margin: auto;
        }

        .footer {
            position: fixed;
            left: 0;
            bottom: 0;
            width: 100%;
            color: white;
            font-family: 'Poppins', sans-serif;
            text-align: center;
            opacity: 0.60;
        }

        a {
            color: white;
        }

        a:hover {
            color: #cccccc;
        }
    </style>
</head>
<body>
<div class="container">
    <h1><%= process.env.TITLE || '📸 Image Web Server' %>
    </h1>
    <h2><%= process.env.DESCRIPTION %>
    </h2>
</div>
<footer class="footer">
    <p>Made by <a href="https://github.com/N0ahMC/ImageWebServer"><b>N0ahMC</b></a></p>
</footer>
</body>
</html>