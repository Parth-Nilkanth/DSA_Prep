const mysql = require('mysql2')
const fs = require('fs')
const db = mysql.createConnection({
  host: 'localhost',
  user  : 'root',
    password : 'root',
    database : 'jalne',
})

db.connect((err) => {
    if(err)
            console.log('Database connection error: ', err);
        else
            console.log('Database connected successfully');
});

const createTableQuery = `
    CREATE TABLE IF NOT EXISTS users (
        id INT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(50),
        skill VARCHAR(50)
    )
`;

// Run the query
db.query(createTableQuery, (err, result) => {
    if (err) {
        console.log("❌ Error creating table:", err);
        return;
    }
    console.log("✅ Table created successfully!");
});

const insertDataQuery = `
    INSERT INTO users (name, skill) VALUES 
    ('Chinmay', 'ML')
`;
db.query(insertDataQuery, (err, result) => {
    if (err) {
        console.log("❌ Error inserting data:", err);
        return;
    }   
    console.log("✅ Data inserted successfully!");
});

const fetchDataQuery = SELECT * FROM users;

db.query(fetchDataQuery, (err, results) => {
    if (err) {
        console.log("❌ Error fetching data:", err);
        return;
    }
    let plainText = "";
    plainText += "Id\tName\tSkill\n";
    results.forEach(row => {
        plainText += row.id;
        plainText += "\t" + row.name;
        plainText += "\t" + row.skill + "\n";
    });

    // Write plain text to file
    fs.writeFileSync('result.txt', plainText);
    console.log("Data successfully written to result.txt!");
});
console.log(" Script execution completed.");