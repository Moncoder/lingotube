package com.moncoder.lingo.vocabulary.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.moncoder.lingo.common.api.LPage;
import com.moncoder.lingo.entity.Word;
import com.moncoder.lingo.vocabulary.domain.dto.WordCreateDTO;
import com.moncoder.lingo.vocabulary.domain.dto.WordViewPageDTO;
import com.moncoder.lingo.vocabulary.domain.vo.WordVO;
import com.moncoder.lingo.vocabulary.domain.vo.WordViewVO;

/**
 * <p>
 * 单词表 服务类
 * </p>
 *
 * @author moncoder
 * @since 2024-06-03 13:51:38
 */
public interface IWordService extends IService<Word> {

    void create(WordCreateDTO wordCreateDTO);

    void importList(String path);

    LPage<WordViewVO> getPageWord(WordViewPageDTO wordViewDTO);
}
