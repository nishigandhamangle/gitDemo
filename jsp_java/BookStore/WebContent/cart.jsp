<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<style>
  *{
      margin: 0;
      padding: 8px;
  }

  body{
      background-image: url(images/back.jpg);
      font-weight: normal;
      font-family: Tahoma;
      color:black ;
  }
  .wrapper{
      width: 705px;
      margin:28px auto;
      padding: 28px;
  }

  h1{
      display: inline-block;
      background-color:wheat;
      color:black ;
      font-size: 15px;
      font-weight: normal;
      text-transform: uppercase;
      padding: 4px 20px;
      float:left;
      border-radius: 50px;
  }

  .clear{
      clear: both;
  }

  .items{
      display: block;
      margin: 20px 0;
  }

  .item{
      background-color:wheat;
      float: left;
      margin: 0 10px 10px 0;
      width: 425px;
      padding: 20px;
  }

  .item img{
      display: block;
      margin: auto;
  }

  h2{
      font-size: 20px;
      display: block;
      border: 1p solid #ccc;
      margin: 0 0 10px 0;
      padding: 0 0 5px 0;
      font:bold;
  }

  button{
      border: 1p solid #555;
      padding: 4px 14px;
      background-color:palevioletred;
      color: white;
      text-transform: uppercase;
      flex: right;
      margin: 5px 0;
      font-weight: 400;
      cursor: pointer;
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      border-radius: 50px;

  }

  button:focus{
      outline: none;

  }

  span{
      float: right;
  }

  p{
      font-size: 18px;
  }

  .Shopping-cart{
      display: inline-block;
      background: url(images/cart.png) no-repeat 0 0;
      width: 100px;
      height: 100px;
      margin: 0 18px;
  }




    </style>
  
</head>
<body>
<%@ page import="com.app.bookdao,com.app.book,java.util.*" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%
List<book> list = bookdao.getAllUsers();
request.setAttribute("list",list);
%>
<br><br><br>

  <div class="Wrapper">
      <h1>Book Available</h1>
      <span><i class="Shopping-cart"></i></span>
      <div class="clear"></div>
      <c:forEach items="${list}" var="u">
      <div class="items">
          <div class="item"><img src="images/let us c.jpg" alt=""><br>
       <h2><b>Let Us C</b></h2>
     <p>Price : Rs200</p>
  <div class="Dropdown">
     <lebel>Quantity  &nbsp;<select name="Quantity">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
            <option value="6">6</option>
            <option value="7">7</option>
            <option value="8">8</option>
            <option value="9">9</option>
            <option value="10">10</option>
          </select>
</lebel>
</div>

     <button class="add-to-Cart" type="button">Add-To-Cart</button>
</div>
</c:forEach>
<div class="item"><img src="images/OOPS with c++.jpg" alt=""><br>
    <h2><b>OOPS With C++</b></h2>
     <p>Price : Rs368</p>
     <div class="Dropdown">
            <lebel>Quantity  &nbsp;<select name="Quantity">
                   <option value="1">1</option>
                   <option value="2">2</option>
                   <option value="3">3</option>
                   <option value="4">4</option>
                   <option value="5">5</option>
                   <option value="6">6</option>
                   <option value="7">7</option>
                   <option value="8">8</option>
                   <option value="9">9</option>
                   <option value="10">10</option>
                 </select>
       </lebel>
       </div>
     <button class="add-to-Cart" type="button">Add-To-Cart</button>
</div>
<div class="item"><img src="images/SQL.jpg" alt=""><br>
    <h2><b>SQL The Complete Reference</b></h2>
     <p>Price : Rs667</p>
     <div class="Dropdown">
            <lebel>Quantity  &nbsp;<select name="Quantity">
                   <option value="1">1</option>
                   <option value="2">2</option>
                   <option value="3">3</option>
                   <option value="4">4</option>
                   <option value="5">5</option>
                   <option value="6">6</option>
                   <option value="7">7</option>
                   <option value="8">8</option>
                   <option value="9">9</option>
                   <option value="10">10</option>
                 </select>
       </lebel>
       </div>
     <button class="add-to-Cart" type="button">Add-To-Cart</button>
</div>



<div class="items">
        <div class="item"><img src="images/Thinking in java.jpg" alt=""><br>
     <h2><b>Thinking in java</b></h2>
   <p>Price : Rs300</p>
<div class="Dropdown">
   <lebel>Quantity  &nbsp;<select name="Quantity">
          <option value="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
          <option value="4">4</option>
          <option value="5">5</option>
          <option value="6">6</option>
          <option value="7">7</option>
          <option value="8">8</option>
          <option value="9">9</option>
          <option value="10">10</option>
        </select>
</lebel>
</div>

   <button class="add-to-Cart" type="button">Add-To-Cart</button>
</div>
<div class="item"><img src="images/ComputerNet.jpg" alt=""><br>
  <h2><b>Computer Network</b></h2>
   <p>Price : Rs250</p>
   <div class="Dropdown">
          <lebel>Quantity  &nbsp;<select name="Quantity">
                 <option value="1">1</option>
                 <option value="2">2</option>
                 <option value="3">3</option>
                 <option value="4">4</option>
                 <option value="5">5</option>
                 <option value="6">6</option>
                 <option value="7">7</option>
                 <option value="8">8</option>
                 <option value="9">9</option>
                 <option value="10">10</option>
               </select>
     </lebel>
     </div>
   <button class="add-to-Cart" type="button">Add-To-Cart</button>
</div>
<div class="item"><img src="images/HeadFIrst.jpg" alt=""><br>
  <h2><b>Head First c#</b></h2>
   <p>Price : Rs400</p>
   <div class="Dropdown">
          <lebel>Quantity  &nbsp;<select name="Quantity">
                 <option value="1">1</option>
                 <option value="2">2</option>
                 <option value="3">3</option>
                 <option value="4">4</option>
                 <option value="5">5</option>
                 <option value="6">6</option>
                 <option value="7">7</option>
                 <option value="8">8</option>
                 <option value="9">9</option>
                 <option value="10">10</option>
               </select>
     </lebel>
     </div>
   <button class="add-to-Cart" type="button">Add-To-Cart</button>
</div>



<div class="items">
        <div class="item"><img src="images/html5 joe.jpg" alt=""><br>
     <h2><b>What is HTML5?</b></h2>
   <p>Price : Rs569</p>
<div class="Dropdown">
   <lebel>Quantity  &nbsp;<select name="Quantity">
          <option value="1">1</option>
          <option value="2">2</option>
          <option value="3">3</option>
          <option value="4">4</option>
          <option value="5">5</option>
          <option value="6">6</option>
          <option value="7">7</option>
          <option value="8">8</option>
          <option value="9">9</option>
          <option value="10">10</option>
        </select>
</lebel>
</div>

   <button class="add-to-Cart" type="button">Add-To-Cart</button>
</div>
<div class="item"><img src="images/HTML5.jpg" alt=""><br>
  <h2><b>HTML5 in Action</b></h2>
   <p>Price : Rs300</p>
   <div class="Dropdown">
          <lebel>Quantity  &nbsp;<select name="Quantity">
                 <option value="1">1</option>
                 <option value="2">2</option>
                 <option value="3">3</option>
                 <option value="4">4</option>
                 <option value="5">5</option>
                 <option value="6">6</option>
                 <option value="7">7</option>
                 <option value="8">8</option>
                 <option value="9">9</option>
                 <option value="10">10</option>
               </select>
     </lebel>
     </div>
   <button class="add-to-Cart" type="button">Add-To-Cart</button>
</div>
<div class="item"><img src="images/c++ complete refernce.jpg" alt=""><br>
  <h2><b>C++ Reference</b></h2>
   <p>Price : Rs523</p>
   <div class="Dropdown">
          <lebel>Quantity  &nbsp;<select name="Quantity">
                 <option value="1">1</option>
                 <option value="2">2</option>
                 <option value="3">3</option>
                 <option value="4">4</option>
                 <option value="5">5</option>
                 <option value="6">6</option>
                 <option value="7">7</option>
                 <option value="8">8</option>
                 <option value="9">9</option>
                 <option value="10">10</option>
               </select>
     </lebel>
     </div>
   <button class="add-to-Cart" type="button">Add-To-Cart</button>
</div>

<div class="item"><img src="images/Head First SQL.jpg" alt=""><br>
    <h2><b>Head First SQL</b></h2>
     <p>Price : Rs450</p>
     <div class="Dropdown">
            <lebel>Quantity  &nbsp;<select name="Quantity">
                   <option value="1">1</option>
                   <option value="2">2</option>
                   <option value="3">3</option>
                   <option value="4">4</option>
                   <option value="5">5</option>
                   <option value="6">6</option>
                   <option value="7">7</option>
                   <option value="8">8</option>
                   <option value="9">9</option>
                   <option value="10">10</option>
                 </select>
       </lebel>
       </div>
     <button class="add-to-Cart" type="button">Add-To-Cart</button>
  </div>
</div></div>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryi/1.12.1/jquery-ui.min.js"></script>

<script src="scripts.js"></script>

</body>
</html>