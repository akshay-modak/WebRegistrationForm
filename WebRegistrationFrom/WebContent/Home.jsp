<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        body {
            font-family: Calibri, Helvetica, sans-serif;
            background-color: rgb(243, 233, 235);
        }

        .container {
            padding: 40px;
            background-color: lightblue;
            margin-right: 40px;
            margin-left: 40px;
        }

        input[type=text],
        input[type=email],
        input[type=date],
        input[type=password],
        textarea {
            width: 100%;
            padding: 15px;
            margin: 5px 0 22px 0;
            display: inline-block;
            border: none;
            background: #f1f1f1;
        }

        input[type=text]:focus,
        input[type=password]:focus {
            background-color: rgb(226, 228, 240);
            outline: none;
        }

        div {
            padding: 10px 0;
        }

        hr {
            border: 1px solid #f1f1f1;
            margin-bottom: 25px;
        }

        

        .btn-group .button {
            background-color: #4CAF50;
            /* Green */
            border: 1px solid green;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            cursor: pointer;
            
        }

        .btn-group .button:not(:last-child) {
            border-right: none;
            /* Prevent double borders */
        }

        .btn-group .button:hover {
            background-color: #3e8e41;
        }
    </style>
</head>

<body>
    <form action="Register" method="post">
        <div class="container">
            <center><h1>Personal Details Form</h1>
            </center>
            <hr>
            <input type="hidden" name="id">
            <label> Firstname </label>
            <input type="text" name="firstname" placeholder="Firstname" size="15" required />

            <label> Lastname: </label>
            <input type="text" name="lastname" placeholder="Lastname" size="15" required />

            <label> Email: </label>
            <input type="email" name="email" placeholder="Email" size="15" required />

            <div><label>Gender :</label> <br>

                <input type="radio" value="Male" name="gender" checked> Male
                <input type="radio" value="Female" name="gender"> Female
            </div>

            <label>Birth Date :</label>
            <input type="date" name="bdate" placeholder="phone no." size="10" required>

            <label>Contact Number :</label>
            <input type="text" name="phone" placeholder="phone no." size="10" required>

            <label>Company Name:</label>
            <input type="text" name="cname" placeholder="Company Name." size="10" required>

            <label>City :</label>
            <input type="text" name="city" placeholder="city" size="10" required>

            <label>Address : </label>
            <textarea cols="80" rows="2" placeholder="Current Address" name="address" required></textarea>

            <div class="btn-group">
                <input type="submit" value="ADD" class="button" name="insert"> 
                <a href="update.jsp">update</a> &nbsp;
                
                <a href="delete.jsp">Delete</a> &nbsp; 
                <input type="button" value="Reset" class="button" name="reset"> &nbsp;
                <a href="display.jsp">Search</a>
                 
               
            </div>
    </form>
</body>

</html>