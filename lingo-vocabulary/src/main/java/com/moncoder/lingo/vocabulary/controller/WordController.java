package com.moncoder.lingo.vocabulary.controller;

import com.moncoder.lingo.common.api.LPage;
import com.moncoder.lingo.common.api.Result;
import com.moncoder.lingo.vocabulary.domain.dto.WordCreateDTO;
import com.moncoder.lingo.vocabulary.domain.dto.WordViewPageDTO;
import com.moncoder.lingo.vocabulary.domain.vo.WordVO;
import com.moncoder.lingo.vocabulary.domain.vo.WordViewVO;
import com.moncoder.lingo.vocabulary.service.IWordService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * <p>
 * 单词表 前端控制器
 * </p>
 *
 * @author moncoder
 * @since 2024-06-03 11:45:58
 */
@Api(tags = "单词管理")
@RestController
@RequestMapping("/word")
public class WordController {

    @Autowired
    private IWordService wordService;

    @ApiOperation("创建单词")
    @PostMapping("/")
    public Result<String> create(@Valid @RequestBody WordCreateDTO wordCreateDTO){
        wordService.create(wordCreateDTO);
        return Result.success();
    }

    @ApiOperation("查看单词列表（分页）")
    @PostMapping("/page")
    public Result<LPage<WordViewVO>> getPage(@Valid @RequestBody WordViewPageDTO wordViewDTO){
        return Result.success(wordService.getPageWord(wordViewDTO));
    }
}
