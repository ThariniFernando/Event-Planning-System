<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
String id=request.getParameter("id");
String name=request.getParameter("name");
String menu=request.getParameter("menu");
String theme=request.getParameter("theme");
String entertainment=request.getParameter("entertainment");
String transport=request.getParameter("transport");
String tmethod=request.getParameter("tmethod");
String pcount=request.getParameter("pcount");
String concern=request.getParameter("concern");




%>


<div class="form-frame">
        <div class="form-container">
            <h1>Customer Event Details Delete</h1>
            <form action="deletecusservlet" id="eventForm" method="post">
            <br><br><br><br><br><br><br>
            <div class="form-title">Book Your Event</div><br><br>
                <div class="form-group">
                Customer ID<input type="text" name="cusid" value="<%=id %>" readonly><br>
                <label for="username">User name</label>
                        <input class="input-box" type="text" id="username" name="username"  value="<%=name %>" readonly><br><br>
                    <label for="menu">Select Food and Beverage Menu</label>
                    <select id="menu" name="menu"   disabled> 
                        <option value="" disabled selected>Select Menu</option>
                        <option value="menu1" <%= menu.equals("menu1") ? "selected" : "" %>>Menu 1</option>
                        <option value="menu2" <%= menu.equals("menu2") ? "selected" : "" %>>Menu 2</option>
                        <option value="menu3" <%= menu.equals("menu3") ? "selected" : "" %>>Menu 3</option>
                        <option value="menu4" <%= menu.equals("menu4") ? "selected" : "" %>>Menu 4</option>
                        <option value="menu5" <%= menu.equals("menu5") ? "selected" : "" %>>Menu 5</option>
                        <option value="menu6" <%= menu.equals("menu6") ? "selected" : "" %>>Menu 6</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="decorations">Select Decoration Theme</label>
                    <select id="decorations" name="decorations"  disabled>
                        <option value="" disabled selected>Select Decoration</option>
                        <option value="theme1" <%= theme.equals("theme1") ? "selected" : "" %>>Theme 1</option>
                        <option value="theme2" <%= theme.equals("theme2") ? "selected" : "" %>>Theme 2</option>
                        <option value="theme3" <%= theme.equals("theme3") ? "selected" : "" %>>Theme 3</option>
                        <option value="theme4" <%= theme.equals("theme4") ? "selected" : "" %>>Theme 4</option>
                        <option value="theme5" <%= theme.equals("theme5") ? "selected" : "" %>>Theme 5</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="entertainment">Select Entertainment</label>
                    <select id="entertainment" name="entertainment"  disabled>
                        <option value="" disabled selected>Select Entertainment</option>
                        <option value="entertainment1" <%= entertainment.equals("entertainment1") ? "selected" : "" %>>Entertainment 1</option>
                        <option value="entertainment2" <%= entertainment.equals("entertainment2") ? "selected" : "" %>>Entertainment 2</option>
                        <option value="entertainment3" <%= entertainment.equals("entertainment3") ? "selected" : "" %>>Entertainment 3</option>
                        <option value="entertainment4" <%= entertainment.equals("entertainment4") ? "selected" : "" %>>Entertainment 4</option>
                        <option value="entertainment5" <%= entertainment.equals("entertainment5") ? "selected" : "" %>>Entertainment 5</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="transportation">Do You Want Transportation?</label>
                    <select id="transportation" name="transportation"  disabled>
                        <option value="" disabled selected>Select an Option</option>
                        <option value="yes" <%= transport.equals("yes") ? "selected" : "" %>>Yes</option>
                        <option value="no" <%= transport.equals("no") ? "selected" : "" %>>No</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="transportMethod">Select Transport Method</label>
                    <select id="transportMethod" name="transportMethod"  disabled>
                    <option value="" disabled selected>Select Transport</option>
                        <option value="method1" <%= tmethod.equals("method1") ? "selected" : "" %>>Method 1</option>
                        <option value="method2" <%= tmethod.equals("method2") ? "selected" : "" %>>Method 2</option>
                        <option value="method3" <%= tmethod.equals("method3") ? "selected" : "" %>>Method 3</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="passengerCount">Enter Number of Passengers</label>
                    <input class="input-box" type="text" id="passengerCount" name="passengerCount" value="<%=pcount %>" readonly>
                </div>
                <div class="form-group">
                    <label for="concerns">Customer Concerns</label>
                    <textarea id="concerns" name="concerns" rows="4"  disabled><%=concern %></textarea>
                </div>
                <button type="submit" class="btn-submit">Delete Account</button>
            </form>
        </div>
    </div>

</body>
</html>