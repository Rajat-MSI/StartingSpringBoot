<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <style>
        label,button
        {
            display: block;
        }
    </style>
</head>
<body>
<form action="${pageContext.request.contextPath}/register-user" method="post">
    <label>User Id</label>
    <input type="text" name="userId">
    <label>User Name</label>
    <input type="text" name="userName">
    <label>Address</label>
    <textarea name="userAddress" cols="19" rows="5"></textarea>
    <label>Status</label>
    <div><input type="radio" name="userStatus" value="Online">&nbsp;Online</div>
    <div><input type="radio" name="userStatus" value="Offline">&nbsp;Offline</div>
    <label>Email</label>
    <input type="text" name="userContact.email">
    <label>Phone number</label>
    <input type="text" name="userContact.phoneNumber">
    <button type="submit">Submit</button>
</form>
</body>
</html>