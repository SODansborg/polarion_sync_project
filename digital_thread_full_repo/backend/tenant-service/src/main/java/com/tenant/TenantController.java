
package com.tenant;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/tenants")
public class TenantController {
 @PostMapping
 public String create(@RequestBody String name){return "tenant-created:"+name;}
}
