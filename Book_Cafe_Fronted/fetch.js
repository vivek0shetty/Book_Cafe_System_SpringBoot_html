// The URL you want to send the GET request to
const url = 'http://localhost:9388/book/gBook';

// Sending a GET request using fetch API
fetch(url, {
        method: 'GET', // GET request
        headers: {
            'Content-Type': 'application/json', // The content type of the request
        }
    })
    .then(response => {
        if (!response.ok) {
            throw new Error(`Network response was not ok ${response.statusText}`);
        }
        return response.json(); // Parse the response as JSON
    })
    .then(data => {
        console.log('Success:', data); // Handle the response data
    })
    .catch(error => {
        console.error('Error:', error); // Handle any errors
    });