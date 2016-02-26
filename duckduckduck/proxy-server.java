import com.temboo.core.*;
import com.temboo.Library.DuckDuckGo.Query;

// Instantiate the session
TembooSession session = new TembooSession("accountName", "myFirstApp", "abc123xxxxxxxxxxxxxx");

// Act as a proxy on behalf of the JavaScript SDK
TembooProxy tembooProxy = new TembooProxy();

// Instantiate the Choreo
Query queryChoreo = new Query(session);

// Add Choreo proxy with an ID matching that specified by the JS SDK client
tembooProxy.addChoreo("jsQuery", queryChoreo);

// Execute the requested Choreo. httpPostData contains the contents of the JavaScript client POST
// request. How this variable is populated will depend on your Java web server implementation
String result = tembooProxy.execute(httpPostData.get("temboo_proxy"), true);