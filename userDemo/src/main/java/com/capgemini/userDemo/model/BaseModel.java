package com.capgemini.userDemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class BaseModel implements Serializable {

    private static final long serialVersionUID = 29283234243L;

//    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
//    @Column(name = "created_date", nullable= false, updatable = false)
//    @CreatedDate
//    private ZonedDateTime createdDate = ZonedDateTime.now();

    @Column(name = "Created_by", nullable = false, updatable = false)
    @CreatedBy
    private String createdBy;


}
