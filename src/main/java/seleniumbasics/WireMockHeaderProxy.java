package seleniumbasics;


import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class WireMockHeaderProxy {
    public static void main(String[] args) {
        // Start WireMock on port 8080
        WireMockServer wireMockServer = new WireMockServer(WireMockConfiguration.wireMockConfig().port(8080));
        wireMockServer.start();

        // Stub for returning 400 response if x-request-id contains 'error400'
        wireMockServer.stubFor(get(urlPathEqualTo("/users"))
                .withHeader("x-request-id", matching(".*error400.*"))
                .willReturn(aResponse()
                        .withStatus(400)
                        .withBody("Mocked 400 Error Response")));

        // Stub for returning 500 response if x-request-id contains 'error500'
        wireMockServer.stubFor(get(urlPathEqualTo("/users"))
                .withHeader("x-request-id", matching(".*error500.*"))
                .willReturn(aResponse()
                        .withStatus(500)
                        .withBody("Mocked 500 Error Response")));

        // Proxy all other requests to the actual API at localhost:3000
        wireMockServer.stubFor(any(anyUrl())
                .willReturn(aResponse()
                        .proxiedFrom("http://localhost:3000")));  // Forward to real API

        System.out.println("WireMock proxy running on port 8080. Proxying requests to localhost:3000");


        // Add shutdown hook to stop the server when the program exits
        //Runtime.getRuntime().addShutdownHook(new Thread(wireMockServer::stop));
    }
}

