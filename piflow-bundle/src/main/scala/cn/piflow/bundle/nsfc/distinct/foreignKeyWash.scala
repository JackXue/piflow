package cn.piflow.bundle.nsfc.distinct

import cn.piflow.{JobContext, JobInputStream, JobOutputStream, ProcessContext}
import cn.piflow.conf.{ConfigurableStop, PortEnum}
import cn.piflow.conf.bean.PropertyDescriptor

class foreignKeyWash extends ConfigurableStop {
  override val authorEmail: String = "xiaomeng7890@gmail.com"
  override val description: String = ""
  //
  override val inportList: List[String] = List(PortEnum.DefaultPort.toString)
  override val outportList: List[String] = List(PortEnum.DefaultPort.toString)

  override def setProperties(map: Map[String, Any]): Unit = ???

  override def getPropertyDescriptor(): List[PropertyDescriptor] = ???

  override def getIcon(): Array[Byte] = ???

  override def getGroup(): List[String] = ???

  override def initialize(ctx: ProcessContext): Unit = ???

  override def perform(in: JobInputStream, out: JobOutputStream, pec: JobContext): Unit = ???
}