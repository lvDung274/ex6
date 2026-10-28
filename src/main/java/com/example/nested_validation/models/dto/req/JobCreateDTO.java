package com.example.nested_validation.models.dto.req;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JobCreateDTO {
    @NotBlank(message = "Tiêu đề tin tuyển dụng không được để trống")
    private String title;

    @NotNull(message = "Lương tối thiểu không được để trống")
    @Min(value = 0, message = "Lương tối thiểu phải lớn hơn hoặc bằng 0")
    private Double salaryMin;

    @NotNull(message = "Lương tối đa không được để trống")
    @Min(value = 0, message = "Lương tối đa phải lớn hơn hoặc bằng 0")
    private Double salaryMax;

    @NotNull(message = "Thông tin công ty không được để trống")
    @Valid
    private CompanyDTO company;
}
