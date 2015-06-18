package cn.liuyiyou.spring.mvc.convert;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * User: liuyiyou
 * Date: 6/18/15
 * Time: 10:57 AM
 */
public class MapMessageConverter extends AbstractHttpMessageConverter<Object> {


    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    private boolean writeAcceptCharset = true;

    private final List<Charset> availableCharsets;

    private final Charset defaultCharset;

    public MapMessageConverter() {
        this(DEFAULT_CHARSET);
    }

    public MapMessageConverter(Charset defaultCharset) {

        //text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8
        super(MediaType.ALL);
        this.defaultCharset = defaultCharset;
        this.availableCharsets = new ArrayList<Charset>(Charset.availableCharsets().values());
        System.out.println("xxxxx");
    }


    @Override
    protected boolean supports(Class<?> clazz) {
        return Map.class.equals(clazz);
    }

    @Override
    protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {

        System.out.println("readInternal");
        return inputMessage.getBody().toString();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected void writeInternal(Object o, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {

        System.out.println("writeInternal");
        if (this.writeAcceptCharset) {
            outputMessage.getHeaders().setAcceptCharset(getAcceptedCharsets());
        }
        Charset charset = getContentTypeCharset(outputMessage.getHeaders().getContentType());

        Writer writer = new OutputStreamWriter((OutputStream)outputMessage, charset);
        writer.write(o.toString());
        writer.flush();
    }


    private Charset getContentTypeCharset(MediaType contentType) {
        if (contentType != null && contentType.getCharSet() != null) {
            return contentType.getCharSet();
        }
        else {
            return this.defaultCharset;
        }
    }

    protected List<Charset> getAcceptedCharsets() {
        return this.availableCharsets;
    }
}
