package com.wdz.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author by Wangdezhao
 * @date 2023/2/17 10:21 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
