package kr.inhatc.shop.utils.audit;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@EntityListeners(value = {AuditingEntityListener.class})
@MappedSuperclass // 테이블로 매핑하지 않고 자식 클래스에게 매핑 정보만 제공
@Getter
@Setter
public abstract class BaseTimeEntity{

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime regTime;      // 등록일

    @LastModifiedDate
    private LocalDateTime updateTime;   // 수정일
}
