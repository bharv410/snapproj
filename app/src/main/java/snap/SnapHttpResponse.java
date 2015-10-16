package snap;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.options.Options;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

import local.org.apache.http.Header;
import local.org.apache.http.HttpEntity;
import local.org.apache.http.StatusLine;
import local.org.apache.http.util.EntityUtils;

public class SnapHttpResponse<T> {

    private int statusCode;
    private String statusText;
    private InputStream rawBody;
    private T body;



    public int getStatus() {
        return statusCode;
    }

    public String getStatusText() {
        return statusText;
    }


    public InputStream getRawBody() {
        return rawBody;
    }

    public T getBody() {
        return body;
    }
}
