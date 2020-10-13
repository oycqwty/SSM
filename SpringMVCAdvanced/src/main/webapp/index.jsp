<html>
<%@page language="java" contentType="text/html; charset=utf-8"
        pageEncoding="utf-8" %>
<body>
<h2>Kevin Number One 牛逼</h2>
<%--<form action="/request/restful" method="post">--%>
<%--<input name="_method" type="hidden" value="DELETE" />--%>
<%--<input type="submit" value="删除" />--%>
<%--</form>--%>

<form action="/upload/uploadFile" method="post" enctype="multipart/form-data">
    <input name="file" type="file"/>
    <input name="desc" type="text"/>
    <input type="submit" value="上传"/>
</form>
</body>
</html>
