<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style type="text/css">
.bg
{background: url('images/2.jpg') no-repeat;
width: 100%;
height: 100%;
}
#log{
    border: 2px solid white;
    padding: 60px 40px;
    margin-top: 80px ;
    -webkit-box-shadow: 4px 12px 46px 19px rgba(0,0,0,0.75);
-moz-box-shadow: 4px 12px 46px 19px rgba(0,0,0,0.75);
box-shadow: 4px 12px 46px 19px rgba(0,0,0,0.75);
}
img{
margin: auto;
width: 150px;

}
h1{
    color:white;
    text-align: center;
    font-weight: bolder;
    margin-top: 20px;
}
h2{ color:white;
}
label{
    font-size: 20px;
    color: white;
}

    </style>
</head>

<body class="bg">
<div class="container-fluid">

    <div class="row">
        <div class="col-md-4 col-sm-4 col-xs-12"></div>
        <div class="col-md-4 col-sm-4 col-xs-12">
            <form action="validate.jsp" method="post" id="log">
                <h1>Login Form</h1>
                <img class="img img-responsive img-circle" src="images/logo.jpg"/>
                <div class="form-group">
                    <label>username</label>
                    <input type="text" name="mobileNo" class="form-control" placeholder="mobileno">
                </div>
                <div class="form-group">
                        <label>Password</label>
                        <input type="password" name="password" class="form-control" placeholder="password">
                    </div>
                    <div class="checkbox">
                        <label><input type="checkbox">Remember me</label>
                    </div>
                    <button type="submit" class="btn btn-success btn-block">Login</button>
                    <div>
                    <center><lable><h2>New User?<a href="Registration.jsp">SignUp</a></h2></center>
                    </div>
                    <div>
                    <center><lable><h2>New User?<a href="login.jsp">Login</a></h2></center>
                    </div>
            </form>
        </div>
        <div class="col-md-4 col-sm-4 col-xs-12"></div>
    </div>
</div>


</body>

</html>