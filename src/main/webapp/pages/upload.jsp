
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/file/accept" enctype="multipart/form-data" method="post">
    输入姓名：<input type="text" name="userName"><br/>
    选择文件：<input type="file"  name="file1"><br/>
    <input type="submit" value="Submit">
</form>
</body>
</html>
