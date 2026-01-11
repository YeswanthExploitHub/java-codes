// 1. Mock API Response (we're simulating the GET response)
const apiResponse = {
  testId: "yes-789",
  question: "From the given users, filter only those whose email ends with '@gmail.com'",
  users: [
    { name: "Ravi", email: "ravi@gmail.com" },
    { name: "Aarthi", email: "aarthi@yahoo.com" },
    { name: "Kumar", email: "kumar@gmail.com" },
    { name: "Sana", email: "sana@outlook.com" }
  ]
};

// 2. Filter only users with Gmail emails
const filteredUsers = apiResponse.users.filter(user =>
  user.email.endsWith("@gmail.com")
);

// 3. Prepare the final submission JSON
const submissionData = {
  testId: apiResponse.testId,
  answer: filteredUsers
};

// 4. Print the final answer that you will POST to server
console.log("Submission Data:", submissionData);

// Step 4: Submit via POST request
fetch("https://mock-api.testserver.com/submit", {
  method: "POST",
  headers: {
    "Content-Type": "application/json",
    "Authorization": "Bearer mock123yeswanth"
  },
  body: JSON.stringify(submissionData)
})
.then(response => response.json())
.then(result => {
  console.log("Server Response:", result);
})
.catch(error => {
  console.error("Submission Failed:", error);
});

