<html>
<body>
    <h1 align="center">Welcome to Patient Home<br><br>
     <a href="applyappointment.jsp">Apply Appointment</a>
     <a href="appointment_applied.jsp">view Appointment</a>
     <a href="index.html">Logout</a>
   </h1>
    <form action="./patientappointment.jsp" align="center">
     <input type="text" name="pname" placeholder="Enter patientname">
     <input type="date" name="date" placeholder="select date">
       <input type="time" name="time" placeholder="Enter time">
     <select name="specialist">
         <option value="Eye">Eye</option>
         <option value="Dentist">Dentist</option>
         <option value="Neurologists">Neurologists</option>
     </select>
     <input type="submit" value="Apply">
   </form>
</body>
</html> 