fetch("http://localhost:8080/users").then((data)=>{
    return data.json();
}).then((ObjectData)=>{
    console.log(ObjectData[0].name);
    let tableData="";
    ObjectData.map((values)=>{
        tableData += `<tr>
        <td>${values.bookingID}</td>
        <td>${values.name}</td>
        <td>${values.email}</td>
        <td>${values.roomtype}</td>
        <td>${values.roomnum}</td>
        <td>${values.guests}</td>
        <td>22/01/23 - 24/01/23</td>
    </tr>`
        
    });
    document.getElementById("tableBody").innerHTML=tableData;
})