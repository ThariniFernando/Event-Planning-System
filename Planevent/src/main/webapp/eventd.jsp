<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/form.css">

</head>


<body>

    <div class="form-frame">
        <div class="form-container">
            
            <form action="eventdetailsservlet" id="eventForm" method="post">
            <br><br><br><br><br><br><br>
            <div class="form-title">Book Your Event</div><br><br>
                <div class="form-group">
                <label for="username">User name</label>
                        <input class="input-box" type="text" id="username" name="username"><br><br>
                    <label for="menu">Select Food and Beverage Menu</label>
                    <select id="menu" name="menu" required> 
                        <option value="" disabled selected>Select Menu</option>
                        <option value="menu1">Menu 1</option>
                        <option value="menu2">Menu 2</option>
                        <option value="menu3">Menu 3</option>
                        <option value="menu4">Menu 4</option>
                        <option value="menu5">Menu 5</option>
                        <option value="menu6">Menu 6</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="decorations">Select Decoration Theme</label>
                    <select id="decorations" name="decorations" required>
                        <option value="" disabled selected>Select Decoration</option>
                        <option value="theme1">Theme 1</option>
                        <option value="theme2">Theme 2</option>
                        <option value="theme3">Theme 3</option>
                        <option value="theme4">Theme 4</option>
                        <option value="theme5">Theme 5</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="entertainment">Select Entertainment</label>
                    <select id="entertainment" name="entertainment" required>
                        <option value="" disabled selected>Select Entertainment</option>
                        <option value="entertainment1">Entertainment 1</option>
                        <option value="entertainment2">Entertainment 2</option>
                        <option value="entertainment3">Entertainment 3</option>
                        <option value="entertainment4">Entertainment 4</option>
                        <option value="entertainment5">Entertainment 5</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="transportation">Do You Want Transportation?</label>
                    <select id="transportation" name="transportation" required>
                        <option value="" disabled selected>Select an Option</option>
                        <option value="yes">Yes</option>
                        <option value="no">No</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="transportMethod">Select Transport Method</label>
                    <select id="transportMethod" name="transportMethod">
                    <option value="" disabled selected>Select Transport</option>
                        <option value="method1">Method 1</option>
                        <option value="method2">Method 2</option>
                        <option value="method3">Method 3</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="passengerCount">Enter Number of Passengers</label>
                    <input class="input-box" type="text" id="passengerCount" name="passengerCount" >
                </div>
                <div class="form-group">
                    <label for="concerns">Customer Concerns</label>
                    <textarea id="concerns" name="concerns" rows="4" required></textarea>
                </div>
                <button type="submit" class="btn-submit">Submit</button>
            </form>
        </div>
    </div>
</body>
</html>
