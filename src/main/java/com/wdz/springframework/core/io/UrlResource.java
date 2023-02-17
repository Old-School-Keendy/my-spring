package com.wdz.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import cn.hutool.core.lang.Assert;

/**
 * @author by Wangdezhao
 * @date 2023/2/17 10:24 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public class UrlResource implements Resource {
    private final URL url;

    public UrlResource(URL url) {
        Assert.notNull(url, "Url must not be null");
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        final URLConnection con = this.url.openConnection();
        try {
            return con.getInputStream();
        } catch (IOException ex) {
            if (con instanceof HttpURLConnection) {
                ((HttpURLConnection)con).disconnect();
            }
            throw ex;
        }
    }
}
