
package com.company.sync.entity;
import jakarta.persistence.*;
@Entity
public class SyncLog {
 @Id @GeneratedValue Long id;
 String status;
}
