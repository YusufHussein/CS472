<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>
<h1 align="center">Beer Selection Page</h1>
<form method="POST"
      action="./BeerSelect2Servlet">
  Select beer characteristics<p>
  Color:
  <select name="color" size="1">
    <option value="light">light</option>
    <option value="amber">amber</option>
    <option value="brown">brown</option>
    <option value="dark">dark</option>
  </select>
  <br/>
  <br/>
  <center>
    <input type="SUBMIT">
  </center>
</form>
</body>
</html>