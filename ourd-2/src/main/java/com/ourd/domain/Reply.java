package com.ourd.domain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@DynamicInsert
@DynamicUpdate
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reply_id", nullable = false)
    private Long replyId;

    @Column(name = "parent", nullable = false)
    private Long parent;

    @Column
    private String parentWriter;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "date")
    private String date;

    @Column(name = "board", nullable = false)
    private Long board;

    @Column(name = "writer", nullable = false)
    private String writer;
    
    @Column(name = "delete_yn", nullable = false)
    private int delete;


}
