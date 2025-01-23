package seleniumbasics;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class WireMockSetup {

    private WireMockServer wireMockServer;

    public void startWireMock() {
        wireMockServer = new WireMockServer(WireMockConfiguration.options().port(8080)); // Running on port 8080
        wireMockServer.start();
        WireMock.configureFor("localhost", 8080);
        setupStubs();
    }

    private void setupStubs() {
        // Stub for CORS preflight requests (OPTIONS method)
        stubFor(options(urlMatching("/api/users.*"))
                .willReturn(aResponse()
                        .withHeader("Access-Control-Allow-Origin", "*")
                        .withHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS")
                        .withHeader("Access-Control-Allow-Headers", "Content-Type, x-request-id")
                        .withStatus(200)));

//        // Stub for a successful response
//        stubFor(post(urlEqualTo("/api/users"))
//                .willReturn(aResponse()
//                        .withStatus(201)
//                        .withHeader("Access-Control-Allow-Origin", "*")
//                        .withBody("{\"message\": \"User registered successfully!\"}")));

        // Stub for a 400 Bad Request response
//        stubFor(post(urlEqualTo("/api/users"))
//                .withHeader("x-request-id", equalTo("error400"))
//                .willReturn(aResponse()
//                        .withStatus(200)
//                        .withHeader("Access-Control-Allow-Origin", "*")
//                        .withBody("{\"message\": \"Bad Request\"}")));

//        // Stub for a 500 Internal Server Error response
//        stubFor(post(urlEqualTo("/api/users"))
//                .withHeader("x-request-id", equalTo("error500"))
//                .willReturn(aResponse()
//                        .withStatus(500)
//                        .withHeader("Access-Control-Allow-Origin", "*")
//                        .withBody("{\"message\": \"Internal Server Error\"}")));
    }

    public void stopWireMock() {
        wireMockServer.stop();
    }
}
