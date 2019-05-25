<!DOCTYPE html>
<%@ page isELIgnored="false" %>
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
<title>Item</title>
</head>
<body>
 <nav>
    <div class="nav-wrapper">
      <a href="#" class="brand-logo">Buying&Selling</a>
          </div>
  </nav>
                           
                                
                                
      <div class="collection">
        <a href="${pageContext.request.contextPath}/create.jsp" class="collection-item">Create Item</a>
        <a href="${pageContext.request.contextPath}/rest/userInfo"  class="collection-item">Get Item details</a>
        <a href="${pageContext.request.contextPath}/update.jsp" class="collection-item">Update Item</a>
        <a href="${pageContext.request.contextPath}/delete.jsp" class="collection-item">Delete Item</a>
      </div>
            
                                
                                
    </div>
     <script type="text/javascript" src="js/materialize.min.js"></script>
</body>
</html>