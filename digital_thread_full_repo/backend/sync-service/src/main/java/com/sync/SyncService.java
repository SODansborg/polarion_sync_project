
package com.sync;
import org.springframework.stereotype.Service;
@Service
public class SyncService {
    public String process(String id){return "processed-"+id;}
}
