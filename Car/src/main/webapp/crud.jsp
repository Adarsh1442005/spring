<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<head>
    <style>
        body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
    display: flex;
}
h1{
    border-top-style: solid;
    border-bottom-style: solid;
    border-left-style: solid;
    border-right-style:solid;
    border-radius: 20px;
    font-size:medium;
    text-align:center;
}
form{
    border:solid;
    text-align: center;
}

        
    </style>   

</head>
<body>
    <span> <h1> Enter new car entry here </h1> <br/>
     <form action="/submit" method="post">
        Enter the Carname:
        <input type="text" name="carname",placeholder="enter car name" required><br/><br/>
        Enter the Carmodel:
        <input type="text" name="model" required><br/><br/>
        Enter the CarPrice:
        <input type="text" name="price" required><br/><br/>
        Enter the Carcolor:
        <input type="text" name="color" required><br/><br/>
        Select the Fueltype:<br/>
        electric: <input type="radio"  name="fueltype" value="electric"><br/>
        Diesel: <input type="radio" name="fueltype" value="diesel"><br/>
        Petrol:<input type="radio"name="fueltype" value="petrol"><br/>
       <center> <button type="submit" style="display: flex; background-color: green;"> submit</button></center>
      </form>    
    </span>
    
   
      
</body>      
</html>