package com.example.demo.service

import com.example.demo.dao.AnythingDao
import com.example.demo.entity.AnythingEntity
import org.springframework.stereotype.Service

@Service
class AnythingService(
        val anythingDao: AnythingDao
) {

    fun findAll(): List<AnythingEntity> {
        return this.anythingDao.selectAll()
    }

    fun insert(anything: AnythingEntity): Int {
        return this.anythingDao.insert(anything)
    }
}