package cn.gp1.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import cn.gp1.dao.BookMapper;
import cn.gp1.dao.BookRepository;
import cn.gp1.dao.FindRepository;
import cn.gp1.dao.UserRepository;
import cn.gp1.pojo.Books;
import cn.gp1.pojo.Users;
import cn.gp1.service.FindService;
import cn.gp1.service.LoginService;

@Service
@Transactional
public class FindServiceImpl implements FindService {
	@Resource
	private FindRepository findrepostory;
	@Resource
	private BookRepository bookRepository;
	@Resource
	private BookMapper bookMapper;

	@Resource
	private UserRepository uRepository;

	@Override
	// 查询所有用户的信息
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return findrepostory.findAll();
	}

	@Override
	// 查询书籍的信息
	public List<Books> findBook() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public boolean updateBook(Integer bid) {
		// TODO Auto-generated method stub
		return bookMapper.update(bid);
	}

	@Override
	public void saveUser(Users user) {
		// TODO Auto-generated method stub
		this.uRepository.save(user);
	}

	@Override
	public void saveBook(Books book) {
		// TODO Auto-generated method stub
		this.bookRepository.save(book);
	}

	@Override
	public Books findBookById(Integer id) {
		// TODO Auto-generated method stub
		return this.bookRepository.getOne(id);
	}
}
