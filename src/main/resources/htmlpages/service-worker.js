self.addEventListener('fetch', function(event) {
    if (event.request.url.includes('/dummy-api')) {
        const randomCode = Math.floor(Math.random() * 3);
        let status;
        let message;

        switch (randomCode) {
            case 0:
                status = 201;
                message = 'User registered successfully!';
                break;
            case 1:
                status = 404;
                message = 'Resource not found. Please try again later.';
                break;
            case 2:
                status = 500;
                message = 'Internal server error. Please try again later.';
                break;
        }

        event.respondWith(
            new Response(
                JSON.stringify({ message }),
                {
                    status: status,
                    headers: { 'Content-Type': 'application/json' }
                }
            )
        );
    } else {
        event.respondWith(fetch(event.request));
    }
});
